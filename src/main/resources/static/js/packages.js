$(document).ready(function () {
	
	$('#addOptionalServiceClass').on('click', function() {
// if ($('#optionalServiceClass').val().length == 1) {
            var optionalServiceClass = $('<div>',{
                class: 'btn btn-outline-success btn-sm m-1 w-100',
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
// }
    });
    $(document).on('click', '.removeOptionalServiceClass', function() {
        $(this).closest('.btn').remove()
    });
    
    $('#idAddSegment').on('click', function() {
        var newIndex = $('#idTbody').prop('childElementCount'); + 1;
        var tr = $('<tr>',{
            class: ''
        })
        tr.append(buildCol('', newIndex, 'airline.code'));
        tr.append(buildCol('', newIndex, 'flightNumber'));
        tr.append(buildCol('', newIndex, 'airportOrigin.codeIATA'));
        tr.append(buildCol('', newIndex, 'departureDate'));
        tr.append(buildCol('', newIndex, 'departureTime'));
        tr.append(buildCol('', newIndex, 'airportDestination.codeIATA'));
        tr.append(buildCol('', newIndex, 'arrivalDate'));
        tr.append(buildCol('', newIndex, 'arrivalTime'));
        tr.append(buildCol('', newIndex, 'Indicator'));
    	$('#idTbody').append(tr);
    });

});

function buildCol(value, index, sufijo){
    var td = $('<td>',{
        class: 'column-separate'
    })
    var input = $('<input>',{
        class: 'box-table',
        type: 'text',
        id: 'segmentsUtil' + index + '.' + sufijo,
        name: 'segmentsUtil[' + index + '].' + sufijo,
        value: ''
    })
    td.append(input)
    return td;
}

