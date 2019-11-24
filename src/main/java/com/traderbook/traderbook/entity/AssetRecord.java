package com.traderbook.traderbook.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

/**
 * AssetRecord is a record of one asset acquired by the user
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_ASSET_RECORD")
public class AssetRecord implements Serializable
{
    private static final long serialVersionUID = 72287626458072444L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ASSET_ID")
    private Asset asset;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENT_PROVIDER_ID")
    private AssetProvider currentProvider;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GOAL_PROVIDER_ID")
    private AssetProvider goalProvider;

    @Embedded
    @AttributeOverrides( {
            @AttributeOverride(name="value", column = @Column(name="OPEN_VALUE") ),
            @AttributeOverride(name="symbol", column = @Column(name="OPEN_COIN_SYMBOL") )
    } )
    private Coin openValue;

    @Embedded
    @AttributeOverrides( {
            @AttributeOverride(name="value", column = @Column(name="CLOSE_VALUE") ),
            @AttributeOverride(name="symbol", column = @Column(name="CLOSE_COIN_SYMBOL") )
    } )
    private Coin closeValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIARY_ID")
    private AssetDiary diary;

    private Instant openPositionDate;
    private Instant closePositionDate;
}
