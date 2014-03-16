package com.ufpb;
import com.ufpb.domain.Produto;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Produto.class)
@Controller
@RequestMapping("/produtoes")
@RooWebScaffold(path = "produtoes", formBackingObject = Produto.class)
public class ProdutoController {
}
