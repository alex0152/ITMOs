# Author = Serebriakov Aleksei Sergeevich
# Group = P3130
# Date = 05.11.2026
import re


def get_correct_words(text: str, length: int, char_list: list) -> list:
    # Регулярное выражение для поиска слова с заданными 3 буквами и расстоянием между ними
    pattern = rf'\b\w*{char_list[0]}\w{{{length}}}{char_list[1]}\w{{{length}}}{char_list[2]}\w*\b'

    # findall возвращает список найденных строк
    return re.findall(pattern, text, re.IGNORECASE)


print(f"Номер варианта для задания 2: 536 509 % 5 = {536509 % 5}")

# Тест №1: В тексте есть совпадения по 3 буквам и длине в 1 символ между ними
my_list = ['К', 'р', 'а']
text_for_test = "Корма\nКорка\nКорчма"
print('\nРезультат теста №1:')
for s in get_correct_words(text_for_test, 1, my_list):
    print(s)

# Тест №2: В тексте есть совпадения по 3 буквам и между ними нет никаких символов
my_list = ['р', 'о', 'м']
text_for_test = "Роман\nКолода\nГром\nПогром"
print('\nРезультат теста №2:')
for s in get_correct_words(text_for_test, 0, my_list):
    print(s)

# Тест №3: В тексте нет совпадений
my_list = ['р', 'о', 'м']
text_for_test = """
    Вы жизнь по-прежнему нисколько
    Не знаете. Сменилась полька
    У них печальным кикапу…
    И что Вам, умной, за охота
    Швырять в них солью анекдота,
    В них видеть только шантрапу?"""
print('\nРезультат теста №3:')
for s in get_correct_words(text_for_test, 0, my_list):
    print(s)

# Тест №4: Слишком большое расстояние
my_list = ['р', 'о', 'м']
text_for_test = "Роман\nКолода\nГром\nПогром"
print('\nРезультат теста №4:')
for s in get_correct_words(text_for_test, 5, my_list):
    print(s)

# Тест №5: Верхний регистр в буквах
my_list = ['Р', 'О', 'М']
text_for_test = "Роман\nКолода\nГром\nПогром"
print('\nРезультат теста №5:')
for s in get_correct_words(text_for_test, 0, my_list):
    print(s)