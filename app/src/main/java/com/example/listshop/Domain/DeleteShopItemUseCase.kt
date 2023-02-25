package com.example.listshop.Domain

class DeleteShopItemUseCase(val repository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        repository.deleteShopItem(shopItem)
    }

}