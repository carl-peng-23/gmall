package com.atecut.gmall.service;

import com.atecut.gmall.bean.*;

import java.util.List;

public interface ManageService {

    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);

    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    List<BaseAttrValue> getAttrValueList(String attrId);

    BaseAttrInfo getAttrInfo(String attrId);

    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    List<BaseSaleAttr> getBaseSaleAttrList();

    void saveSpuInfo(SpuInfo spuInfo);

    List<SpuImage> getSpuImageList(SpuImage spuImage);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);

    SkuInfo getSkuInfo(String skuId);

    List<SkuImage> getSkuImageBySkuId(String skuId);

    List<SpuSaleAttr> getSpuSaleAttrListCheckBySku(SkuInfo skuInfo);

    List<SkuSaleAttrValue> getSkuSaleAttrValueListBySpu(String spuId);
}