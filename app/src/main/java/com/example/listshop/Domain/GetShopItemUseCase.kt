package com.example.listshop.Domain

class GetShopItemUseCase(val repository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return repository.getShopItem(shopItemId)
    }

}