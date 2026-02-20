// Call the dataTables jQuery plugin
$(document).ready(function() {
    CargarLibros();
    $('#libros').DataTable();
})

async function CargarLibros(){
    const request = await fetch('api/libros', {
        method: 'GET',  
        headers: getHeaders()
    });
    const libros = await request.json();
    let listadoHTML = '';
    for (let libro of libros){
    let botonEliminar = '<a href="#" onclick="EliminarLibro('+libro.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
        let libroHTML = '<tr><td>'+libro.id+'</td><td>'+libro.titulo+'</td><td>'+libro.autor+'</td><td>'+libro.editorial+'</td><td>'+libro.anio+'</td><td>'+libro.precio+'</td><td>'+botonEliminar+'</td></tr>';
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

 async function EliminarLibro(id){ 

    if (!confirm('¿Desea eliminar este libro?')){
        return;
    }
    const request = await fetch('api/libros/'+id, {
        method: 'DELETE',  
        headers: getHeaders()
    });
    location.reload();
}
