const aluno = {
    nome: "João",
    idade: 18,
    notas: [8, 7, 9],
  
    // Adicione a propriedade 'disciplina' aqui
    disciplina: "matemática",
    // Modifique a idade do aluno aqui
    idade: 31,


   
    // Crie o método 'mostrarInformacoes' aqui
    Info: function() {
        console.log(this.nome);
        console.log(this.idade);
        console.log(this.disciplina);
        console.log(this.notas);
    }

  };
  // Chame o método 'mostrarInformacoes' para exibir os detalhes do aluno
  aluno.Info();

const valorNotas = aluno.notas.reduce((acc,crr)=>
    acc+crr,0
)
let media = valorNotas/3

console.log(media)