# задание прав с помощью команды chmod
# u - владелец, g - группа-владелец, o - остальные пользователи
# "+" - добавляем права, "-" - убираем права, "=" - задаем права
# rwx/7 - все права, rw/6 - чтение и запись, rx/5 - чтение и исполнение
# r/4 - чтение, wx/3 - запись и исполнение, w/2 - запись, x/1 - исполнение
# " "/0 - нет прав
cd ./lab0
chmod go=r,u= alakazam
chmod 400 burmy
chmod ugo=rw,o-w chingling
chmod u=wx,o=rx,g= hoppip
chmod ug=rx,g+w,o= hoppip/charmeleon
chmod 064 hoppip/wurmple
chmod 337 hoppip/bibarel
chmod ugo=r hoppip/dratini
chmod ugo=rx hoppip/rhyperior
chmod ugo=x,u+r,g+rw poliwhirl
chmod ug=r,u+w,o= poliwhirl/vanilluxe 
chmod 357 poliwhirl/floatzel
chmod ugo=rw,o-w poliwhirl/purrloin
chmod ug=wx,o= poliwhirl/bibarel
chmod 046 poliwhirl/trubbish
chmod ugo=x,u+rw zweilous
chmod 700 zweilous/turtwig
chmod 066 zweilous/clefairy
chmod 711 zweilous/larvesta
chmod 004 zweilous/rufflet

