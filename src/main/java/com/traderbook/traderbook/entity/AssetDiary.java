package com.traderbook.traderbook.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * AssetDiary stores all asset records for a user
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_ASSET_DIARY")
public class AssetDiary implements Serializable
{
    private static final long serialVersionUID = 7033901262433238968L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "diary", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AssetRecord> records;

    // TODO in the future support multiple user diary
    private String user;
}
