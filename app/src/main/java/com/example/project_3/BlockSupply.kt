package com.example.project_3

class BlockSupply {
    companion object {
        fun getLesson() : List<BlockInfo> {
            val list: MutableList<BlockInfo> = ArrayList()
            list.add(BlockInfo("Понедельник", "-"))
            list.add(BlockInfo("Вторник", "7 Базы данных \n" +
                    "8 Базы данных"))
            list.add(BlockInfo("Среда", "7 Управление процессов \n" +
                    "8 Управление процессов"))
            list.add(BlockInfo("Четверг", "7 Базы данных \n" +
                    "8 Анализ данных"))
            list.add(BlockInfo("Пятница", "7 Веб разработка \n" +
                    "8 Веб разработка"))
            list.add(BlockInfo("Суббота", "2 Андроид разработка \n" +
                    "3 Андроид разработка \n" +
                    "4 Андроид разработка \n" +
                    "5 Андроид разработка "))

            return list
        }
    }
}