# Obter Diploma

É necessário desenvolver uma API que receba um aluno que contenha o seu "nome",
e todas as disciplinas aprovadas com "nome" e "nota", é necessário calcular a média
das notas obtidas ao longo do curso e gerar o diploma com uma “mensagem”,
“média” e “aluno”.
Se a média do aluno for superior a 9, deve ser reconhecido com um parabéns.

# Segunda parte da implementacao:

#1
Validação de campos de entrada.
As validações necessárias devem ser realizadas nos campos referentes ao
StudentDTO e SubjectDTO (request), utilizando as anotações que julgar
necessárias para validar as entradas.

#2
Exceções de dados de entrada.
As exceções de dados de entrada devem ser tratadas usando as seguintes classes
ApiExceptionControllerAdvice
ValidationError: indicando campo e mensagem

#3
Exceções de resposta.
As exceções de resposta devem ser tratadas com as seguintes classes
ValidationError
ApiExceptionControllerAdvice