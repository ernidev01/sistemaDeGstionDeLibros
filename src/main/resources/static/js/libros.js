// Call the dataTables jQuery plugin
$(document).ready(function() {
    CargarLibros();
    $('#libros').DataTable();
})

async function CargarLibros(){
    const request = await fetch('libros', {
        method: 'GET',  
        headers: getHeaders()
    });
    const libros = await request.json();
    let listadoHTML = '';
    for (let libro of libros){
        let libroHTML = '<tr><td>'+libro.id+'</td><td>'+libro.titulo+'</td><td>'+libro.autor+'</td><td>'+libro.editorial+'</td><td>'+libro.anio+'</td></tr>';
        listadoHTML += libroHTML;
    
}
document.querySelector('#libros tbody').outerHTML = listadoHTML;
}

function getHeaders(){
  return {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }
}