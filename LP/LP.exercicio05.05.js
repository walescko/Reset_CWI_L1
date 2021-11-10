receitaMensal = 1450
custoMercadoria= 1000
lucroBruto = receitaMensal - custoMercadoria
margemBruta = lucroBruto/receitaMensal
margemBruta100 = (margemBruta*100).toFixed(2)
console.log("Receita Mensal R$ " + receitaMensal)
console.log("Compras do mês R$ " + custoMercadoria)
console.log("Lucro = " + receitaMensal + " - " + custoMercadoria + " = " +lucroBruto)
console.log("Lucro Bruto R$ " + lucroBruto)
console.log("Margem Bruta de Lucro " + margemBruta100 + " %")