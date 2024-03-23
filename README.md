# PlayerPointsAddon
This is an addon for the SimplePets v5 plugin, This allows the plugin to support purchasing pets using an economy (aka the PlayerPoints Plugin)

### Requirements:
- [PlayerPoints](https://www.spigotmc.org/resources/80745/) Plugin `(At least v3.0.0)`

### Default configuration (Located in `plugins/SimplePets/Addons/config/PlayerPoints.yml`)
```yaml
# Disabling this will make the items show the price, but if the player has bypass permissions he wont have to pay
# Default: true
Hide-Price-If-Bypassed: true

# Should players have to pay each time they spawn a pet?
# Default: false
Pay-Per-Use-Enabled: false
Price:
  # If a pet is free this will be in the place of the price in the lore
  # Default: 'Free'
  Free: Free
  # If the player has the bypass permission, will be in the place of the price in the lore
  # Default: 'BYPASSED'
  Bypassed: BYPASSED

# Here is where you can set the translations for the 2 boolean values (true/false)
Boolean:
  'true': '&#92fc98true'
  'false': '&#fa7d7dfalse'
Messages:
  prefix: '&eSimplePets &6>>'
  PurchaseSuccessful:
    # This message will be sent if the purchase it successful
    # Placeholders:
    # - {prefix} (uses the customized prefix)
    # - {type} (will get what type of pet it is)
    # - {price} (what price the pet is)
    One-Time-Purchase: '{prefix} &7You have Successfully Purchased the {type} Pet.'
    # This message will be sent if the purchase it successful while Pay-Per-Use is set to true
    # Placeholders:
    # - {prefix} (uses the customized prefix)
    # - {type} (will get what type of pet it is)
    # - {price} (what price the pet is)
    Pay-Per-Use: '{prefix} &7You have Successfully Paid for the {type} Pet.'
  # This message will be sent if the player does not have enough money to buy the pet
  # Placeholders:
  # - {prefix} (uses the customized prefix)
  # - {type} (will get what type of pet it is)
  # - {price} (what price the pet is)
  InsufficientFunds: '{prefix} &cYou do not have enough money to buy this pet, you
    need to have {price}'
  Lore-Lines:
    # These Lore Lines will only be used if 'Pay-Per-Use' is set to false
    # Placeholders:
    # - {price} (price of the pet)
    # - {purchased} (true/false if the player purchased the pet)
    One-Time-Purchase:
    - '&#ffbf5ePrice: &#99ffac{price}'
    - '&#ffbf5ePurchased: {purchased}'
    # These lines get added to the pet items when the GUI is opened
    # Placeholders:
    # - {price} (price of the pet)
    # - {purchased} (true/false if the player purchased the pet)
    Pay-Per-Use:
    - '&#ffbf5ePrice: &#99ffac{price}'
bypass_permissions:
  # This is the master permission, Will ignore all individual bypass permissions listed below
  parent: pet.playerpoints.bypass
  type:
    # This is a bypass permission for the allay pet, who ever has this permission will now have to pay for this pet
    allay: pet.playerpoints.bypass.allay
    # This is a bypass permission for the armor_stand pet, who ever has this permission will now have to pay for this pet
    armor_stand: pet.playerpoints.bypass.armor_stand
    # This is a bypass permission for the axolotl pet, who ever has this permission will now have to pay for this pet
    axolotl: pet.playerpoints.bypass.axolotl
    # This is a bypass permission for the bat pet, who ever has this permission will now have to pay for this pet
    bat: pet.playerpoints.bypass.bat
    # This is a bypass permission for the bee pet, who ever has this permission will now have to pay for this pet
    bee: pet.playerpoints.bypass.bee
    # This is a bypass permission for the blaze pet, who ever has this permission will now have to pay for this pet
    blaze: pet.playerpoints.bypass.blaze
    # This is a bypass permission for the camel pet, who ever has this permission will now have to pay for this pet
    camel: pet.playerpoints.bypass.camel
    # This is a bypass permission for the cat pet, who ever has this permission will now have to pay for this pet
    cat: pet.playerpoints.bypass.cat
    # This is a bypass permission for the cave_spider pet, who ever has this permission will now have to pay for this pet
    cave_spider: pet.playerpoints.bypass.cave_spider
    # This is a bypass permission for the chicken pet, who ever has this permission will now have to pay for this pet
    chicken: pet.playerpoints.bypass.chicken
    # This is a bypass permission for the cod pet, who ever has this permission will now have to pay for this pet
    cod: pet.playerpoints.bypass.cod
    # This is a bypass permission for the cow pet, who ever has this permission will now have to pay for this pet
    cow: pet.playerpoints.bypass.cow
    # This is a bypass permission for the creeper pet, who ever has this permission will now have to pay for this pet
    creeper: pet.playerpoints.bypass.creeper
    # This is a bypass permission for the dolphin pet, who ever has this permission will now have to pay for this pet
    dolphin: pet.playerpoints.bypass.dolphin
    # This is a bypass permission for the donkey pet, who ever has this permission will now have to pay for this pet
    donkey: pet.playerpoints.bypass.donkey
    # This is a bypass permission for the drowned pet, who ever has this permission will now have to pay for this pet
    drowned: pet.playerpoints.bypass.drowned
    # This is a bypass permission for the elder_guardian pet, who ever has this permission will now have to pay for this pet
    elder_guardian: pet.playerpoints.bypass.elder_guardian
    # This is a bypass permission for the enderman pet, who ever has this permission will now have to pay for this pet
    enderman: pet.playerpoints.bypass.enderman
    # This is a bypass permission for the endermite pet, who ever has this permission will now have to pay for this pet
    endermite: pet.playerpoints.bypass.endermite
    # This is a bypass permission for the evoker pet, who ever has this permission will now have to pay for this pet
    evoker: pet.playerpoints.bypass.evoker
    # This is a bypass permission for the fox pet, who ever has this permission will now have to pay for this pet
    fox: pet.playerpoints.bypass.fox
    # This is a bypass permission for the frog pet, who ever has this permission will now have to pay for this pet
    frog: pet.playerpoints.bypass.frog
    # This is a bypass permission for the ghast pet, who ever has this permission will now have to pay for this pet
    ghast: pet.playerpoints.bypass.ghast
    # This is a bypass permission for the giant pet, who ever has this permission will now have to pay for this pet
    giant: pet.playerpoints.bypass.giant
    # This is a bypass permission for the glow_squid pet, who ever has this permission will now have to pay for this pet
    glow_squid: pet.playerpoints.bypass.glow_squid
    # This is a bypass permission for the goat pet, who ever has this permission will now have to pay for this pet
    goat: pet.playerpoints.bypass.goat
    # This is a bypass permission for the guardian pet, who ever has this permission will now have to pay for this pet
    guardian: pet.playerpoints.bypass.guardian
    # This is a bypass permission for the hoglin pet, who ever has this permission will now have to pay for this pet
    hoglin: pet.playerpoints.bypass.hoglin
    # This is a bypass permission for the horse pet, who ever has this permission will now have to pay for this pet
    horse: pet.playerpoints.bypass.horse
    # This is a bypass permission for the husk pet, who ever has this permission will now have to pay for this pet
    husk: pet.playerpoints.bypass.husk
    # This is a bypass permission for the illusioner pet, who ever has this permission will now have to pay for this pet
    illusioner: pet.playerpoints.bypass.illusioner
    # This is a bypass permission for the iron_golem pet, who ever has this permission will now have to pay for this pet
    iron_golem: pet.playerpoints.bypass.iron_golem
    # This is a bypass permission for the llama pet, who ever has this permission will now have to pay for this pet
    llama: pet.playerpoints.bypass.llama
    # This is a bypass permission for the magma_cube pet, who ever has this permission will now have to pay for this pet
    magma_cube: pet.playerpoints.bypass.magma_cube
    # This is a bypass permission for the mooshroom pet, who ever has this permission will now have to pay for this pet
    mooshroom: pet.playerpoints.bypass.mooshroom
    # This is a bypass permission for the mule pet, who ever has this permission will now have to pay for this pet
    mule: pet.playerpoints.bypass.mule
    # This is a bypass permission for the ocelot pet, who ever has this permission will now have to pay for this pet
    ocelot: pet.playerpoints.bypass.ocelot
    # This is a bypass permission for the panda pet, who ever has this permission will now have to pay for this pet
    panda: pet.playerpoints.bypass.panda
    # This is a bypass permission for the parrot pet, who ever has this permission will now have to pay for this pet
    parrot: pet.playerpoints.bypass.parrot
    # This is a bypass permission for the phantom pet, who ever has this permission will now have to pay for this pet
    phantom: pet.playerpoints.bypass.phantom
    # This is a bypass permission for the pig pet, who ever has this permission will now have to pay for this pet
    pig: pet.playerpoints.bypass.pig
    # This is a bypass permission for the piglin pet, who ever has this permission will now have to pay for this pet
    piglin: pet.playerpoints.bypass.piglin
    # This is a bypass permission for the piglin_brute pet, who ever has this permission will now have to pay for this pet
    piglin_brute: pet.playerpoints.bypass.piglin_brute
    # This is a bypass permission for the pillager pet, who ever has this permission will now have to pay for this pet
    pillager: pet.playerpoints.bypass.pillager
    # This is a bypass permission for the polarbear pet, who ever has this permission will now have to pay for this pet
    polarbear: pet.playerpoints.bypass.polarbear
    # This is a bypass permission for the pufferfish pet, who ever has this permission will now have to pay for this pet
    pufferfish: pet.playerpoints.bypass.pufferfish
    # This is a bypass permission for the rabbit pet, who ever has this permission will now have to pay for this pet
    rabbit: pet.playerpoints.bypass.rabbit
    # This is a bypass permission for the ravager pet, who ever has this permission will now have to pay for this pet
    ravager: pet.playerpoints.bypass.ravager
    # This is a bypass permission for the salmon pet, who ever has this permission will now have to pay for this pet
    salmon: pet.playerpoints.bypass.salmon
    # This is a bypass permission for the sheep pet, who ever has this permission will now have to pay for this pet
    sheep: pet.playerpoints.bypass.sheep
    # This is a bypass permission for the shulker pet, who ever has this permission will now have to pay for this pet
    shulker: pet.playerpoints.bypass.shulker
    # This is a bypass permission for the silverfish pet, who ever has this permission will now have to pay for this pet
    silverfish: pet.playerpoints.bypass.silverfish
    # This is a bypass permission for the skeleton pet, who ever has this permission will now have to pay for this pet
    skeleton: pet.playerpoints.bypass.skeleton
    # This is a bypass permission for the skeleton_horse pet, who ever has this permission will now have to pay for this pet
    skeleton_horse: pet.playerpoints.bypass.skeleton_horse
    # This is a bypass permission for the slime pet, who ever has this permission will now have to pay for this pet
    slime: pet.playerpoints.bypass.slime
    # This is a bypass permission for the sniffer pet, who ever has this permission will now have to pay for this pet
    sniffer: pet.playerpoints.bypass.sniffer
    # This is a bypass permission for the snowman pet, who ever has this permission will now have to pay for this pet
    snowman: pet.playerpoints.bypass.snowman
    # This is a bypass permission for the spider pet, who ever has this permission will now have to pay for this pet
    spider: pet.playerpoints.bypass.spider
    # This is a bypass permission for the squid pet, who ever has this permission will now have to pay for this pet
    squid: pet.playerpoints.bypass.squid
    # This is a bypass permission for the stray pet, who ever has this permission will now have to pay for this pet
    stray: pet.playerpoints.bypass.stray
    # This is a bypass permission for the strider pet, who ever has this permission will now have to pay for this pet
    strider: pet.playerpoints.bypass.strider
    # This is a bypass permission for the tadpole pet, who ever has this permission will now have to pay for this pet
    tadpole: pet.playerpoints.bypass.tadpole
    # This is a bypass permission for the trader_llama pet, who ever has this permission will now have to pay for this pet
    trader_llama: pet.playerpoints.bypass.trader_llama
    # This is a bypass permission for the tropical_fish pet, who ever has this permission will now have to pay for this pet
    tropical_fish: pet.playerpoints.bypass.tropical_fish
    # This is a bypass permission for the turtle pet, who ever has this permission will now have to pay for this pet
    turtle: pet.playerpoints.bypass.turtle
    # This is a bypass permission for the vex pet, who ever has this permission will now have to pay for this pet
    vex: pet.playerpoints.bypass.vex
    # This is a bypass permission for the villager pet, who ever has this permission will now have to pay for this pet
    villager: pet.playerpoints.bypass.villager
    # This is a bypass permission for the vindicator pet, who ever has this permission will now have to pay for this pet
    vindicator: pet.playerpoints.bypass.vindicator
    # This is a bypass permission for the wandering_trader pet, who ever has this permission will now have to pay for this pet
    wandering_trader: pet.playerpoints.bypass.wandering_trader
    # This is a bypass permission for the warden pet, who ever has this permission will now have to pay for this pet
    warden: pet.playerpoints.bypass.warden
    # This is a bypass permission for the witch pet, who ever has this permission will now have to pay for this pet
    witch: pet.playerpoints.bypass.witch
    # This is a bypass permission for the wither pet, who ever has this permission will now have to pay for this pet
    wither: pet.playerpoints.bypass.wither
    # This is a bypass permission for the wither_skeleton pet, who ever has this permission will now have to pay for this pet
    wither_skeleton: pet.playerpoints.bypass.wither_skeleton
    # This is a bypass permission for the wolf pet, who ever has this permission will now have to pay for this pet
    wolf: pet.playerpoints.bypass.wolf
    # This is a bypass permission for the zoglin pet, who ever has this permission will now have to pay for this pet
    zoglin: pet.playerpoints.bypass.zoglin
    # This is a bypass permission for the zombie pet, who ever has this permission will now have to pay for this pet
    zombie: pet.playerpoints.bypass.zombie
    # This is a bypass permission for the zombie_horse pet, who ever has this permission will now have to pay for this pet
    zombie_horse: pet.playerpoints.bypass.zombie_horse
    # This is a bypass permission for the zombie_villager pet, who ever has this permission will now have to pay for this pet
    zombie_villager: pet.playerpoints.bypass.zombie_villager
    # This is a bypass permission for the zombified_piglin pet, who ever has this permission will now have to pay for this pet
    zombified_piglin: pet.playerpoints.bypass.zombified_piglin
type:
  # The price of the allay pet
  allay: 100
  # The price of the armor_stand pet
  armor_stand: 100
  # The price of the axolotl pet
  axolotl: 100
  # The price of the bat pet
  bat: 100
  # The price of the bee pet
  bee: 100
  # The price of the blaze pet
  blaze: 100
  # The price of the camel pet
  camel: 100
  # The price of the cat pet
  cat: 100
  # The price of the cave_spider pet
  cave_spider: 100
  # The price of the chicken pet
  chicken: 100
  # The price of the cod pet
  cod: 100
  # The price of the cow pet
  cow: 100
  # The price of the creeper pet
  creeper: 100
  # The price of the dolphin pet
  dolphin: 100
  # The price of the donkey pet
  donkey: 100
  # The price of the drowned pet
  drowned: 100
  # The price of the elder_guardian pet
  elder_guardian: 100
  # The price of the enderman pet
  enderman: 100
  # The price of the endermite pet
  endermite: 100
  # The price of the evoker pet
  evoker: 100
  # The price of the fox pet
  fox: 100
  # The price of the frog pet
  frog: 100
  # The price of the ghast pet
  ghast: 100
  # The price of the giant pet
  giant: 100
  # The price of the glow_squid pet
  glow_squid: 100
  # The price of the goat pet
  goat: 100
  # The price of the guardian pet
  guardian: 100
  # The price of the hoglin pet
  hoglin: 100
  # The price of the horse pet
  horse: 100
  # The price of the husk pet
  husk: 100
  # The price of the illusioner pet
  illusioner: 100
  # The price of the iron_golem pet
  iron_golem: 100
  # The price of the llama pet
  llama: 100
  # The price of the magma_cube pet
  magma_cube: 100
  # The price of the mooshroom pet
  mooshroom: 100
  # The price of the mule pet
  mule: 100
  # The price of the ocelot pet
  ocelot: 100
  # The price of the panda pet
  panda: 100
  # The price of the parrot pet
  parrot: 100
  # The price of the phantom pet
  phantom: 100
  # The price of the pig pet
  pig: 100
  # The price of the piglin pet
  piglin: 100
  # The price of the piglin_brute pet
  piglin_brute: 100
  # The price of the pillager pet
  pillager: 100
  # The price of the polarbear pet
  polarbear: 100
  # The price of the pufferfish pet
  pufferfish: 100
  # The price of the rabbit pet
  rabbit: 100
  # The price of the ravager pet
  ravager: 100
  # The price of the salmon pet
  salmon: 100
  # The price of the sheep pet
  sheep: 100
  # The price of the shulker pet
  shulker: 100
  # The price of the silverfish pet
  silverfish: 100
  # The price of the skeleton pet
  skeleton: 100
  # The price of the skeleton_horse pet
  skeleton_horse: 100
  # The price of the slime pet
  slime: 100
  # The price of the sniffer pet
  sniffer: 100
  # The price of the snowman pet
  snowman: 100
  # The price of the spider pet
  spider: 100
  # The price of the squid pet
  squid: 100
  # The price of the stray pet
  stray: 100
  # The price of the strider pet
  strider: 100
  # The price of the tadpole pet
  tadpole: 100
  # The price of the trader_llama pet
  trader_llama: 100
  # The price of the tropical_fish pet
  tropical_fish: 100
  # The price of the turtle pet
  turtle: 100
  # The price of the vex pet
  vex: 100
  # The price of the villager pet
  villager: 100
  # The price of the vindicator pet
  vindicator: 100
  # The price of the wandering_trader pet
  wandering_trader: 100
  # The price of the warden pet
  warden: 100
  # The price of the witch pet
  witch: 100
  # The price of the wither pet
  wither: 100
  # The price of the wither_skeleton pet
  wither_skeleton: 100
  # The price of the wolf pet
  wolf: 100
  # The price of the zoglin pet
  zoglin: 100
  # The price of the zombie pet
  zombie: 100
  # The price of the zombie_horse pet
  zombie_horse: 100
  # The price of the zombie_villager pet
  zombie_villager: 100
  # The price of the zombified_piglin pet
  zombified_piglin: 100
```