$(document).ready(function () {
	
	$('#addOptionalServiceClass').on('click', function() {
//        if ($('#optionalServiceClass').val().length == 1) {
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
//        }
    });
    $(document).on('click', '.removeOptionalServiceClass', function() {
        $(this).closest('.btn').remove()
    });
    
    $('#idAddSegment').on('click', function() {
        var newIndex = $('#idTbody').prop('childElementCount'); + 1;
        var tr = $('<tr>',{
            class: '',
            style: ''
        })
        tr.append(buildCol($('#idAirline').val(), newIndex, 'airline.code'));
        tr.append(buildCol($('#idFlightNumber').val(), newIndex, 'flightNumber'));
        tr.append(buildCol($('#idAirportOrigin').val(), newIndex, 'airportOrigin.codeIATA'));
        tr.append(buildCol($('#idDepartureDate').val(), newIndex, 'departureDate'));
        tr.append(buildCol($('#idDepartureTime').val(), newIndex, 'departureTime'));
        tr.append(buildCol($('#idAirportDestination').val(), newIndex, 'airportDestination.codeIATA'));
        tr.append(buildCol($('#idArrivalDate').val(), newIndex, 'arrivalDate'));
        tr.append(buildCol($('#idArrivalTime').val(), newIndex, 'arrivalTime'));
        tr.append(buildCol($('#idIndicator').val(), newIndex, 'Indicator'));
    	$('#idTbody').append(tr);
    });

});

function buildCol(value, index, sufijo){
    var td = $('<td>',{
        class: '',
        style: ''
    })
    var label = $('<label>',{
        class: '',
        style: '',
        text: '' + value
    })
    var input = $('<input>',{
        class: '',
        style: '',
        type: 'hidden',
        id: 'segmentsUtil' + index + '.' + sufijo,
        name: 'segmentsUtil[' + index + '].' + sufijo,
        value: '' + value
    })
    td.append(label)
    td.append(input)
    return td;
}

