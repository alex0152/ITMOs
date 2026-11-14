# создаем и переходим в директорию lab0
mkdir lab0
cd ./lab0
# создаем файлы alakazam, burmy, chingling в директории lab0 и заполняем их текстовыми данными
touch alakazam burmy chingling
echo -e "Возможности = Overland=7 Surface=3\nJump=2 Power=2 Intelligence=7 Aura=0\nTelekinetic=0 Telepath=0" > alakazam
echo -e "weigth=7.5 height=8.0 atk=3 def=5" > burmy
echo -e "weigth=1.3 height=8.0 atk=5 def=5" > chingling
# создаем  директории hoppip, poliwhirl, zweilous, которые находятся в lab0
mkdir hoppip poliwhirl zweilous
cd ./hoppip
# создаем  директории charmeleon, bibarel, rhyperior, которые находятся в lab0/hoppip
mkdir charmeleon bibarel rhyperior
# создаем файлы wurmple, dratini в директории lab0/hoppip и заполняем их текстовыми данными
touch wurmple dratini 
echo -e "Ходы = Bug Bite Electroweb Snore String\nShot" > wurmple
echo -e "Тип покемона = DRAGON NONE" > dratini
cd ../poliwhirl
# создаем  директории floatzel, bibarel, которые находятся в lab0/poliwhirl
mkdir floatzel bibarel
# создаем файлы vanilluxe, purrloin, trubbish в директории lab0/poliwhirl и заполняем их текстовыми данными
touch vanilluxe purrloin trubbish
echo -e "Способности = Harden Astonish Uproar Icy\nWind Mist Avalanche Taunt Mirror Shot\nAcid Armor Ice Beam Hail Mirror Coat\nBlizzard Sheer Cold" > vanilluxe
echo -e "Живет = Forest Grassland Rainforest\nUrban" > purrloin
echo -e "Возможности = Overland=5 Surface=4\nJump=1 Power=2 Intelligence=4\nInflatable=0" > trubbish
cd ../zweilous
# создаем  директории turtwig, larvesta, которые находятся в lab0/zweilous
mkdir turtwig larvesta
# создаем файлы clefairy, rufflet в директории lab0/zweilous и заполняем их текстовыми данными
touch clefairy rufflet
echo -e "Способности = Last Chance Cute Charm\nMagic Guard" > clefairy
echo -e "Способности = Leer Peck Fury Attack Wing\nAttack Hone Claws Scary Face Aerial Ace\nSlash Defog Tailwind Air Slash Crush\nClaw Sky Drop Whirlwind Brave Bird\nTrash" > rufflet


