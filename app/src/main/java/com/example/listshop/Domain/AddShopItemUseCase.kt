package com.example.listshop.Domain

class AddShopItemUseCase(val repository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        repository.addShopItem(shopItem)
    }

}