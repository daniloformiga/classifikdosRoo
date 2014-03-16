package com.ufpb;
import com.ufpb.domain.Anuncio;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Anuncio.class)
@Controller
@RequestMapping("/anuncios")
@RooWebScaffold(path = "anuncios", formBackingObject = Anuncio.class)
public class AnuncioController {
}
