package com.traderbook.traderbook.repository;

import com.traderbook.traderbook.entity.AssetProvider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetProviderRepository extends CrudRepository<AssetProvider,Long>
{
}
