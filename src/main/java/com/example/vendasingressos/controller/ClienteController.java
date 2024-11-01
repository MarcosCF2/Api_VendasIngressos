package com.example.vendasingressos.controller;

import com.example.vendasingressos.model.Cliente;
import com.example.vendasingressos.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static sun.security.ssl.SSLLogger.info;

@RestController
@RequestMapping("/api/cliente")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Cliente",
        description = "Operation for customar")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get all customer from DB",
                description = "Fetches all customer from DB and return" + "in JSON Array"
    )
    @ApiResponses(value = `{
            @ApiResponse(responseCode = "200", descriptio = "successful"),
        @ApiResponse(responseCode = "404", description = "not fund")
    })
    public List<ClienteDto> getAllCliene() `{
        log.info("Buscando todos os Clinte");
        return  clienteService.getALLCliente();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.com)
    @|Operation(summary = "Get one city from DB",
                description = "Fetches one city from DB and retur "+
                    "in JSON object"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "sucessful"),
            @ApiResponse(responseCode = "404", description = "not fund")}
    })
        public ResponseEntity<ClienteDto> getClienteById(@PathVariable(name = "id") Long id) throws ResourNotFundException{
        log.info("Atualizando cidade: {}", clienteDto);
        return ResponseEntity<ClienteDto> updateCliente(@PathVariable(name = "id") Long id, @RequestBody ClienteDto clienteDto) throws ResourceNotFundExceptio {
            }
            @DeleteMapping("{id}")
            @Operation(summary = "Remove city",
                description = "Remove a city in database"
            )
            public Map<String, Boolean> deleteCliente(@PathVariable(name = "id") Long id) throws Exception {
                log. info("Deletando Cliente: {}", id);
                Map<String, Boolean> response = new HashMap<>();
                response.put("deleted", clienteService(id));
                return response;
            }
}
