package com.boa.api.web.rest;

//import com.boa.api.domain.CategorieBiller;
//import com.boa.api.repository.CategorieBillerRepository;
import com.boa.api.response.ListCategBillersResponse;
import com.boa.api.service.CategorieBillerService;
import com.boa.api.web.rest.errors.BadRequestAlertException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;


/**
 * REST controller for managing {@link com.boa.api.domain.CategorieBiller}.
 */
@RestController
@RequestMapping("/api")
public class CategorieBillerResource {

  /*private final Logger log = LoggerFactory.getLogger(CategorieBillerResource.class);

  private static final String ENTITY_NAME = "categorieBiller";

  @Value("${jhipster.clientApp.name}")
  private String applicationName;

  private final CategorieBillerService categorieBillerService;

  private final CategorieBillerRepository categorieBillerRepository;

  public CategorieBillerResource(CategorieBillerService categorieBillerService, CategorieBillerRepository categorieBillerRepository) {
    this.categorieBillerService = categorieBillerService;
    this.categorieBillerRepository = categorieBillerRepository;
  }

  /**
   * {@code POST  /categorie-billers} : Create a new categorieBiller.
   *
   * @param categorieBiller the categorieBiller to create.
   * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new categorieBiller, or with status {@code 400 (Bad Request)} if the categorieBiller has already an ID.
   * @throws URISyntaxException if the Location URI syntax is incorrect.
   */
  /*@PostMapping("/categorie-billers")
  public ResponseEntity<CategorieBiller> createCategorieBiller(@Valid @RequestBody CategorieBiller categorieBiller)
    throws URISyntaxException {
    log.debug("REST request to save CategorieBiller : {}", categorieBiller);
    if (categorieBiller.getId() != null) {
      throw new BadRequestAlertException("A new categorieBiller cannot already have an ID", ENTITY_NAME, "idexists");
    }
    CategorieBiller result = categorieBillerService.save(categorieBiller);
    return ResponseEntity
      .created(new URI("/api/categorie-billers/" + result.getId()))
      .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
      .body(result);
  }

  /**
   * {@code PUT  /categorie-billers/:id} : Updates an existing categorieBiller.
   *
   * @param id the id of the categorieBiller to save.
   * @param categorieBiller the categorieBiller to update.
   * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated categorieBiller,
   * or with status {@code 400 (Bad Request)} if the categorieBiller is not valid,
   * or with status {@code 500 (Internal Server Error)} if the categorieBiller couldn't be updated.
   * @throws URISyntaxException if the Location URI syntax is incorrect.
   */
  /*@PutMapping("/categorie-billers/{id}")
  public ResponseEntity<CategorieBiller> updateCategorieBiller(
    @PathVariable(value = "id", required = false) final Long id,
    @Valid @RequestBody CategorieBiller categorieBiller
  ) throws URISyntaxException {
    log.debug("REST request to update CategorieBiller : {}, {}", id, categorieBiller);
    if (categorieBiller.getId() == null) {
      throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
    }
    if (!Objects.equals(id, categorieBiller.getId())) {
      throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
    }

    if (!categorieBillerRepository.existsById(id)) {
      throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
    }

    CategorieBiller result = categorieBillerService.save(categorieBiller);
    return ResponseEntity
      .ok()
      .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, categorieBiller.getId().toString()))
      .body(result);
  }

  /**
   * {@code PATCH  /categorie-billers/:id} : Partial updates given fields of an existing categorieBiller, field will ignore if it is null
   *
   * @param id the id of the categorieBiller to save.
   * @param categorieBiller the categorieBiller to update.
   * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated categorieBiller,
   * or with status {@code 400 (Bad Request)} if the categorieBiller is not valid,
   * or with status {@code 404 (Not Found)} if the categorieBiller is not found,
   * or with status {@code 500 (Internal Server Error)} if the categorieBiller couldn't be updated.
   * @throws URISyntaxException if the Location URI syntax is incorrect.
   */
  /*@PatchMapping(value = "/categorie-billers/{id}", consumes = "application/merge-patch+json")
  public ResponseEntity<CategorieBiller> partialUpdateCategorieBiller(
    @PathVariable(value = "id", required = false) final Long id,
    @NotNull @RequestBody CategorieBiller categorieBiller
  ) throws URISyntaxException {
    log.debug("REST request to partial update CategorieBiller partially : {}, {}", id, categorieBiller);
    if (categorieBiller.getId() == null) {
      throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
    }
    if (!Objects.equals(id, categorieBiller.getId())) {
      throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
    }

    if (!categorieBillerRepository.existsById(id)) {
      throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
    }

    Optional<CategorieBiller> result = categorieBillerService.partialUpdate(categorieBiller);

    return ResponseUtil.wrapOrNotFound(
      result,
      HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, categorieBiller.getId().toString())
    );
  }

  /**
   * {@code GET  /categorie-billers} : get all the categorieBillers.
   *
   * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of categorieBillers in body.
   */
  /*@GetMapping("/categorie-billers")
  public ListCategBillersResponse getAllCategorieBillers() {
    log.debug("REST request to get all CategorieBillers");
    return categorieBillerService.findAll();
  }

  /**
   * {@code GET  /categorie-billers/:id} : get the "id" categorieBiller.
   *
   * @param id the id of the categorieBiller to retrieve.
   * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the categorieBiller, or with status {@code 404 (Not Found)}.
   */
  /*@GetMapping("/categorie-billers/{id}")
  public ResponseEntity<CategorieBiller> getCategorieBiller(@PathVariable Long id) {
    log.debug("REST request to get CategorieBiller : {}", id);
    Optional<CategorieBiller> categorieBiller = categorieBillerService.findOne(id);
    return ResponseUtil.wrapOrNotFound(categorieBiller);
  }

  /**
   * {@code DELETE  /categorie-billers/:id} : delete the "id" categorieBiller.
   *
   * @param id the id of the categorieBiller to delete.
   * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
   */
  /*@DeleteMapping("/categorie-billers/{id}")
  public ResponseEntity<Void> deleteCategorieBiller(@PathVariable Long id) {
    log.debug("REST request to delete CategorieBiller : {}", id);
    categorieBillerService.delete(id);
    return ResponseEntity
      .noContent()
      .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
      .build();
  }*/
}
