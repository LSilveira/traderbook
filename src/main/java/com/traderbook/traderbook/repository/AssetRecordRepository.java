package com.traderbook.traderbook.repository;

import com.traderbook.traderbook.entity.AssetRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRecordRepository extends CrudRepository<AssetRecord,Long>
{
}
