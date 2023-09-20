class LeituraNumero {
    constructor() {
        this.numeroPrimitivo = null;
        this.numeroWrapper = null;
    }

    lerNumero() {
        // Leitura do valor numérico do console
        this.numeroPrimitivo = Number(prompt("Digite um valor numérico: "));
    }

    converterParaWrapper() {
        // Conversão para o tipo Wrapper
        this.numeroWrapper = this.numeroPrimitivo;
    }

    imprimirNumero() {
        // Impressão do valor numérico
        console.log("O valor numérico é: " + this.numeroWrapper);
    }
}

const leituraNumero = new LeituraNumero();

leituraNumero.lerNumero();
leituraNumero.converterParaWrapper();
leituraNumero.imprimirNumero();
