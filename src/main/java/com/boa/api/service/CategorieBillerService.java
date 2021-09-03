package com.boa.api.service;

//import com.boa.api.domain.CategorieBiller;
//import com.boa.api.repository.CategorieBillerRepository;
import com.boa.api.response.ListCategBillersResponse;
import com.boa.api.service.util.ICodeDescResponse;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link CategorieBiller}.
 */
@Service
@Transactional
public class CategorieBillerService {

  /*private final Logger log = LoggerFactory.getLogger(CategorieBillerService.class);

  private final CategorieBillerRepository categorieBillerRepository;

  public CategorieBillerService(CategorieBillerRepository categorieBillerRepository) {
    this.categorieBillerRepository = categorieBillerRepository;
  }

  /**
   * Save a categorieBiller.
   *
   * @param categorieBiller the entity to save.
   * @return the persisted entity.
   */
  /*public CategorieBiller save(CategorieBiller categorieBiller) {
    log.debug("Request to save CategorieBiller : {}", categorieBiller);
    return categorieBillerRepository.save(categorieBiller);
  }

  /**
   * Partially update a categorieBiller.
   *
   * @param categorieBiller the entity to update partially.
   * @return the persisted entity.
   */
  /*public Optional<CategorieBiller> partialUpdate(CategorieBiller categorieBiller) {
    log.debug("Request to partially update CategorieBiller : {}", categorieBiller);

    return categorieBillerRepository
      .findById(categorieBiller.getId())
      .map(
        existingCategorieBiller -> {
          if (categorieBiller.getLibelle() != null) {
            existingCategorieBiller.setLibelle(categorieBiller.getLibelle());
          }
          if (categorieBiller.getCode() != null) {
            existingCategorieBiller.setCode(categorieBiller.getCode());
          }

          return existingCategorieBiller;
        }
      )
      .map(categorieBillerRepository::save);
  }

  /**
   * Get all the categorieBillers.
   *
   * @return the list of entities.
   */
  /*@Transactional(readOnly = true)
  public ListCategBillersResponse findAll() {
    log.debug("Request to get all CategorieBillers");
    List<CategorieBiller> list = categorieBillerRepository.findAll();
    ListCategBillersResponse billersResponse = new ListCategBillersResponse();
    for (CategorieBiller categorieBiller : list) {
      com.boa.api.response.CategorieBiller iCategorieBiller = new com.boa.api.response.CategorieBiller();
      iCategorieBiller.code(categorieBiller.getCode()).libelle(categorieBiller.getLibelle());
      billersResponse.getListCategoriesBillers().add(iCategorieBiller);
    }
    billersResponse.setCode(ICodeDescResponse.SUCCES_CODE);
    billersResponse.setDescription(ICodeDescResponse.SUCCES_DESCRIPTION);
    billersResponse.setDateResponse(Instant.now());
    return billersResponse;
  }

  /**
   * Get one categorieBiller by id.
   *
   * @param id the id of the entity.
   * @return the entity.
   */
  /*@Transactional(readOnly = true)
  public Optional<CategorieBiller> findOne(Long id) {
    log.debug("Request to get CategorieBiller : {}", id);
    return categorieBillerRepository.findById(id);
  }

  /**
   * Delete the categorieBiller by id.
   *
   * @param id the id of the entity.
   */
  /*public void delete(Long id) {
    log.debug("Request to delete CategorieBiller : {}", id);
    categorieBillerRepository.deleteById(id);
  }*/
}
