
    var preguntas = document.querySelectorAll('.preguntaa');
   
   preguntas.forEach(function(pregunta) {
     var respuestaa = pregunta.nextElementSibling;
     
     pregunta.addEventListener('click', function() {
       if (respuestaa.style.display === 'none') {
         respuestaa.style.display = 'block';
       } else {
         respuestaa.style.display = 'none';
       }
     });
   });
  
  
  
   
  
  const boton = document.querySelector('.boton-nuevo');
  const respuesta = document.querySelector('.respuestasboton');
  
  boton.addEventListener('click', () => {
  respuesta.classList.toggle('mostrar');
  });
  
  
  
  const pageLinks = document.querySelectorAll('.page-link');
  const contentDivs = document.querySelectorAll('.content');
  
  pageLinks.forEach((link) => {
    link.addEventListener('click', (e) => {
      e.preventDefault();
      const pageNum = Number(e.target.innerText);
      contentDivs.forEach((div) => {
        div.style.display = 'none';
      });
      document.querySelector(`#content-${pageNum}`).style.display = 'block';
    });
  });
  
      
      $(document).ready(function(){
          // Obtener el número total de páginas
          var totalPages = $('.pagination li').length;
  
          // Mostrar la primera página
          $('.page').hide();
          $('.page:first').show();
  
          // Agregar eventos click a los elementos de paginación
          $('.pagination li').click(function(){
              var clickedIndex = $(this).index();
              var nextPage = clickedIndex + 1;
  
              // Ocultar todas las páginas y mostrar la siguiente página
              $('.page').hide();
              $('.page:nth-child(' + nextPage + ')').show();
          });
      });
  
  
