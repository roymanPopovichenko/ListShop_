package com.example.listshop.Domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun getShopList(): LiveData<List<ShopItem>>

    fun getShopItem(shopItemId: Int): ShopItem

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

}