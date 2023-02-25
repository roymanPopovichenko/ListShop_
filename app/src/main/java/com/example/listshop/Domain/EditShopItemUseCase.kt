package com.example.listshop.Domain

class EditShopItemUseCase(val repository: ShopListRepository) {

    private val name = "xyi"

    fun editShopItem(shopItem: ShopItem) {
        repository.editShopItem(shopItem)
    }

}