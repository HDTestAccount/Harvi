# Harvi
Эндпоинты - 
http://localhost:8080/swagger-ui.html
http://localhost:8080/v2/api-docs

Отправка значения в очередь - http://localhost:8080/putValue/"queueName"?qValue="Value"
Если очередь не существует - она создастся, если существует - значение будет добавлено в конец.
Получение значения из очереди - http://localhost:8080/getLoopValue/"queueName" (getLoopValue / getStackValue - получение с переносом значения в конец очереди \ просто получение значения.)
