package com.traderbook.traderbook.repository;

import com.traderbook.traderbook.entity.Asset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends CrudRepository<Asset,Long>
{
}
