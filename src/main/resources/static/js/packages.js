$(document).ready(function () {
	
//	$('button[type="submit"]').on('click', function(e) {
//		e.preventDefault();
//		   $.post($("#form").attr('action'), function(request, response) {console.log(request)});
//	});
	
	
	$('#addOptionalServiceClass').on('click', function() {
        if ($('#optionalServiceClass').val().length == 1) {
            var optionalServiceClass = $('<div>',{
                class: 'btn btn-outline-success btn-sm m-1',
                style: 'min-width: 64px;'
            })
            optionalServiceClass.append($('<span>',{
                class: 'pr-1',
                text: $('#optionalServiceClass').val()
            }))
            optionalServiceClass.append($('<i>',{
                class: 'fas fa-trash removeOptionalServiceClass'
            }))
            optionalServiceClass.append($('<input>', {
                type: 'hidden',
                name: 'cont',
                value: $('#optionalServiceClass').val()
            }))
            $('#optionalServicesClass').append(optionalServiceClass)
        }
    });
    $(document).on('click', '.removeOptionalServiceClass', function() {
        $(this).closest('.btn').remove()
    });
    
    
    $('#idAddSegment').on('click', function() {
    	console.log('add');
//    	var tr = $('<tr>',{
//            class: 'btn btn-outline-success btn-sm m-1',
//            style: 'min-width: 64px;'
//        })
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idAirline').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idFlightNumber').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idAirportOrigin').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idDepartureDate').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idDepartureTime').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idAirportDestination').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idArrivalDate').val()
//        }))
//        tr.append($('<td>',{
//            class: 'pr-1',
//            text: $('#idArrivalTime').val()
//        }))
//    	$('#idTbody').append(tr)
    });

});
