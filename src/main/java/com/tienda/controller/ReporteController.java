package com.tienda.controller;

import com.tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReporteController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/reporte/inventario-bajo")
    public String productosInventarioBajo(Model model) {
        var productos = productoService.listarProductosInventarioBajo();
        model.addAttribute("productos", productos);
        return "/reporte/inventarioBajo";
    }
}
