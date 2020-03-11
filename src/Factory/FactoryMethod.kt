package Factory

/*
fun Factory.main() {
    println(Factory.WalletStore(SimpleWalletFactory()).orderWallet(Factory.WalletType.Factory.Leather).name)
}

class Factory.WalletStore(private val factory: Factory.WalletFactory) {
    fun orderWallet(type: Factory.WalletType): Factory.Wallet {
        return factory.createWallet(type)
    }
}

class SimpleWalletFactory : Factory.WalletFactory {
    override fun createWallet(type: Factory.WalletType): Factory.Wallet {
        return when (type) {
            Factory.WalletType.Factory.Leather -> Factory.LeatherWallet()
            Factory.WalletType.Factory.Paper -> Factory.PaperWallet()
            Factory.WalletType.Factory.Cloth -> Factory.ClothWallet()
        }
    }
}

interface Factory.WalletFactory {
    fun createWallet(type: Factory.WalletType): Factory.Wallet
}

interface Factory.Wallet {
    val name: String
}

class Factory.LeatherWallet : Factory.Wallet {
    override val name = "革ザイフ"
}

class Factory.PaperWallet : Factory.Wallet {
    override val name = "紙ザイフ"
}

class Factory.ClothWallet : Factory.Wallet {
    override val name = "布ザイフ"
}

enum class Factory.WalletType {
    Factory.Leather,
    Factory.Paper,
    Factory.Cloth
}*/