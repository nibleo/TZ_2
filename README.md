[![Test](https://github.com/nibleo/TZ_2/actions/workflows/main.yml/badge.svg)](https://github.com/nibleo/TZ_2/actions/workflows/main.yml)

В этом репозитории приведена, релизованная на Java простейшая программа, которая считывает из файла числа, а далее отдельными функциями ищет среди этих чисел минимальное число, максимальное число, считает их общую сумму и произведение.

Функции называются, соответственно min (минимальное число), max (максимальное число), sum (сумма всех чисел), mult (произведение всех чисел).

Для функций поиска максимальной суммы и произведения предусмотрены проверки на переход через максимально возможное значение числа. Если такое происходит, функция возвращает 0.

Для проверки корректности работы каждой из функций предусмотрены тесты, которые состоят из 10, 100, 1000, 10000, 100000, 10000000 чисел.

После корректного завершения работы тестов была получена диаграмма, описывающая зависимость время работы метода поиска максимума от количества чисел во входном файле.

![image](https://github.com/nibleo/TZ_2/assets/167456991/76d6df05-6b8b-4ea5-ae4f-85348a3af7bf)

Был заведён репозиторий для этого проекта на GitHub, оформлен простейший README.md. Загружены в репозиторий файлы проекта (код, тесты, README.md).

Была подключена к проекту CI-система GitHub Actions. Обеспечена возможность запуска тестов в ручном режиме, по щелчку кнопки в веб-интерфейсе CI-системы. Для этого необходимо перейти во вкладку Actions, выбрать ManualTests, далее выбрать run workflow и выбрать тест, который необходимо прогнать

Настроена CI таким образом, чтобы прогон тестов запускался автоматически при любом новом коммите в репозиторий проекта.

Сделана интеграция CI-системы и репозитория на GitHub: сделан бэйдж в README.md, который показывает текущий статус тестов.

Сделана интеграция CI-системыи и мессенджера telegram (имя бота: @best_Git_NOtification_Bot, для корректной работы необходимо добавить в чат и выдать права администратора). Система настроена так, что при успешном прохождении теста посылается сообщение "все ок", при неуспешном - посылалается информация, какие именно тесты не пройдены.
