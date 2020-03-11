package factory

fun main() {
    println(
        WalletStore(JapaneseWalletFactory()).orderWallet(
            WalletType.Leather
        ).showMaterial()
    )
}

class WalletStore(private val factory: WalletFactory) {
    fun orderWallet(type: WalletType): Wallet {
        return when (type) {
            WalletType.Leather -> LeatherWallet(factory)
            WalletType.Paper -> PaperWallet(factory)
            WalletType.Cloth -> ClothWallet(factory)
        }
    }
}

class JapaneseWalletFactory : WalletFactory {
    override val leather = JapaneseLeather()
    override val paper = JapanesePaper()
    override val cloth = JapaneseCloth()
}

interface WalletFactory {
    val leather: Leather
    val paper: Paper
    val cloth: Cloth
}

abstract class Wallet(protected val factory: WalletFactory) {
    abstract val name: String
    abstract fun showMaterial(): String
}

class JapaneseLeather : Leather {
    override val name = "日本の革"
}

class JapanesePaper : Paper {
    override val name = "日本の紙"
}

class JapaneseCloth : Cloth {
    override val name = "日本の布"
}

interface Leather {
    val name: String
}

interface Paper {
    val name: String
}

interface Cloth {
    val name: String
}

class LeatherWallet(factory: WalletFactory) : Wallet(factory) {
    override val name = "革ザイフ"
    override fun showMaterial(): String = factory.leather.name
}

class PaperWallet(factory: WalletFactory) : Wallet(factory) {
    override val name = "紙ザイフ"
    override fun showMaterial(): String = factory.paper.name
}

class ClothWallet(factory: WalletFactory) : Wallet(factory) {
    override val name = "布ザイフ"
    override fun showMaterial(): String = factory.cloth.name
}

enum class WalletType {
    Leather,
    Paper,
    Cloth
}