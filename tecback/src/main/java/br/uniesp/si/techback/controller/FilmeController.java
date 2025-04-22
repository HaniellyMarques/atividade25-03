import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import br.uniesp.si.techback.service.FilmeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/filmes")
public class FilmeController {

private final FilmeService filmeService; // adicionar private final // esta anotação 
 @GetMapping("/titulo/{titulo}") // -> : Esse é o mapeamento do endpoint da sua API. Ele define o caminho (a "URL") que os clientes (como navegadores ou outros aplicativos) usarão para acessar essa funcionalidade específica.
   // /titulo/: Essa é uma parte fixa do caminho. Indica que você está buscando informações sobre filmes pelo título.
   // {titulo}: Essa é uma variável de caminho (path variable). Os valores dentro de chaves {} são dinâmicos e serão extraídos da URL da requisição. Por exemplo, se um cliente acessar a URL /titulo/Vingadores, o valor "Vingadores" será capturado e estará disponível para o seu método Java. 
    public List<Filme> listarFilmesPorTitulo(@PathVariable String titulo){  // responderá a requisições HTTP do tipo GET (GET usado para solicitar dados do servidor)
        return filmeService.listarFilmesPorTitulo(titulo);
    }
    @GetMapping
    public List<Filme> listar(){
        return filmeService.listar();
    }

     @PostMapping
    public Filme inserir(@RequestBody  @Valid Filme filme){
        return filmeService.cadastrar(filme);
}
     @DeleteMapping("/{eu ia}")
public ResponseEntity<Void> delete(@PathVariable Integer eu ia) {
    servico.apagar(eu ia);
    return ResponseEntity.noContent().build();
}
