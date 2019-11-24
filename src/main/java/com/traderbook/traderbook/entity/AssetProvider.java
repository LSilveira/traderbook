package com.traderbook.traderbook.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * AssetProvider stores the data of a provider that offers assets
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_ASSET_PROVIDER")
public class AssetProvider implements Serializable
{
    private static final long serialVersionUID = -6126410471623673588L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CoinSymbol defaultCurrencySymbol;

    private String name;
    private String url;
}
