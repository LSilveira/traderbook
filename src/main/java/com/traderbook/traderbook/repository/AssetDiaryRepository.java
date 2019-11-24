package com.traderbook.traderbook.repository;

import com.traderbook.traderbook.entity.AssetDiary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetDiaryRepository extends CrudRepository<AssetDiary,Long>
{
}
