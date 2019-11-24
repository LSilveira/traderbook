package com.traderbook.traderbook.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Asset class represents a specific asset
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_ASSET")
public class Asset implements Serializable
{
    private static final long serialVersionUID = -2971349750627065975L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;
}
