saldo = 1000.00
console.log("Saldo inicial: R$ " + saldo.toFixed(2))
compra = 99.00
console.log("Compra de calças: - R$ " + compra.toFixed(2))
saldo = saldo - compra
salario = 2500.00
saldo = saldo + salario
console.log("Recebimento de Salário: + R$ " + salario.toFixed(2))
doacao = 0.100
saldo = saldo - doacao
console.log("Doações: - R$ " + doacao.toFixed(2))
compra = saldo*0.25
saldo = saldo - compra
console.log("Compra Ar-Condicionado: - R$ " + compra.toFixed(2))
pagamento = saldo/2
saldo = saldo - pagamento
console.log("Pagamento de Dívida: - R$ " + pagamento.toFixed(2))
console.log("Saldo Atual: R$ " + saldo.toFixed(2))