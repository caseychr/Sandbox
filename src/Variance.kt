
class Barrel<in T>(item: T)

fun main(args: Array<String>) {
    var fedoraBarrel: Barrel<Fedora> = Barrel(Fedora("a generic-looking fedora", 15))
    var lookBarrel: Barrel<Loot> = Barrel(Coin(15))

    fedoraBarrel = lookBarrel
}