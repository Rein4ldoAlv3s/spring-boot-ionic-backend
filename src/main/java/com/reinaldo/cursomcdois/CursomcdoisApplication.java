package com.reinaldo.cursomcdois;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reinaldo.cursomcdois.domain.Categoria;
import com.reinaldo.cursomcdois.domain.Cidade;
import com.reinaldo.cursomcdois.domain.Cliente;
import com.reinaldo.cursomcdois.domain.Endereco;
import com.reinaldo.cursomcdois.domain.Estado;
import com.reinaldo.cursomcdois.domain.ItemPedido;
import com.reinaldo.cursomcdois.domain.Pagamento;
import com.reinaldo.cursomcdois.domain.PagamentoComBoleto;
import com.reinaldo.cursomcdois.domain.PagamentoComCartao;
import com.reinaldo.cursomcdois.domain.Pedido;
import com.reinaldo.cursomcdois.domain.Produto;
import com.reinaldo.cursomcdois.domain.enums.EstadoPagamento;
import com.reinaldo.cursomcdois.domain.enums.TipoCliente;
import com.reinaldo.cursomcdois.repositories.CategoriaRepository;
import com.reinaldo.cursomcdois.repositories.CidadeRepository;
import com.reinaldo.cursomcdois.repositories.ClienteRepository;
import com.reinaldo.cursomcdois.repositories.EnderecoRepository;
import com.reinaldo.cursomcdois.repositories.EstadoRepository;
import com.reinaldo.cursomcdois.repositories.ItemPedidoRepository;
import com.reinaldo.cursomcdois.repositories.PagamentoRepository;
import com.reinaldo.cursomcdois.repositories.PedidoRepository;
import com.reinaldo.cursomcdois.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcdoisApplication implements CommandLineRunner{
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcdoisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
