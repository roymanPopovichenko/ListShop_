package com.example.listshop.Domain

class EditShopItemUseCase(val repository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        repository.editShopItem(shopItem)
    }

}