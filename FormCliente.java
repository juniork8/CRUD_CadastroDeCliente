package br.com.cliente.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import br.com.cliente.bean.Cliente;
import br.com.cliente.controle.ClienteBC;
import br.com.cliente.util.MaskCampos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.text.ParseException;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCliente extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtMunicipio;
	private JFormattedTextField txtCep;
	private JFormattedTextField txtCel;
    private JFormattedTextField txtTel;
    private JFormattedTextField txtCnpj;
	private JFormattedTextField txtCpf;
	private JTextField txtID;
	private JComboBox cbPesquisar;
	private ButtonGroup bt = new ButtonGroup();
	   
	private String genero;
	  
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnF;
	private JButton btnSalvar;
	private JButton btnExcluir;
	private JButton btnEditar;
	private JButton btnPesquisar;
	private JButton btnLimpar;
	
	/*
	public void FormClientes() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
		}
		public JTextField getTxtEndereco() {
			return txtEndereco;
		}
		public void setTxtEndereco(JTextField txtEndereco) {
			this.txtEndereco = txtEndereco;
		}
		public JTextField getTxtNome() {
			return txtNome;
		}
		public void setTxtNome(JTextField txtNome) {
			this.txtNome = txtNome;
		}
		public void actionPerformed(ActionEvent e) {
		
		}
		*/
	
	public FormCliente() {
		   setTitle("Cadastro de Clientes");
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setBounds(100, 100, 556, 413);
		   contentPane = new JPanel();
		   contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		   setContentPane(contentPane);
		   contentPane.setLayout(null);
		   
		   JLabel lblPesquisar = new JLabel("Pesquisar:");
		   lblPesquisar.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblPesquisar.setBounds(10, 31, 109, 14);
		   contentPane.add(lblPesquisar);
		   
		   JLabel lblNome = new JLabel("Nome/Empresa:");
		   lblNome.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblNome.setBounds(10, 79, 109, 14);
		    contentPane.add(lblNome);
		   
		    JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		   lblEndereo.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblEndereo.setBounds(10, 104, 109, 14);
		   contentPane.add(lblEndereo);
		   
		   JLabel lblNewLabel = new JLabel("Munic\u00EDpio:");
		   lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblNewLabel.setBounds(10, 129, 109, 14);
		   contentPane.add(lblNewLabel);
		   
		   JLabel lblCep = new JLabel("Cep:");
		   lblCep.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblCep.setBounds(10, 154, 109, 14);
		   contentPane.add(lblCep);
		   
		   JLabel lblTel = new JLabel("Tel:");
		   lblTel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblTel.setBounds(10, 179, 109, 14);
		   contentPane.add(lblTel);
		    
		   JLabel lblCel = new JLabel("Cel:");
		   lblCel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblCel.setBounds(10, 204, 109, 14);
		   contentPane.add(lblCel);
		   
		   JLabel lblCpf = new JLabel("Cpf:");
		   lblCpf.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblCpf.setBounds(10, 229, 109, 14);
		   contentPane.add(lblCpf);
		   
		   JLabel lblCnpj = new JLabel("Cnpj:");
		   lblCnpj.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblCnpj.setBounds(10, 254, 109, 14);
		   contentPane.add(lblCnpj);
		   
		   JLabel lblGnero = new JLabel("G\u00EAnero:");
		   lblGnero.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblGnero.setBounds(10, 279, 109, 14);
		   contentPane.add(lblGnero);
		   
		   cbPesquisar = new JComboBox();
		   cbPesquisar.setEditable(true);
		   cbPesquisar.setBounds(129, 28, 283, 20);
		   AutoCompleteDecorator.decorate(cbPesquisar);
		   contentPane.add(cbPesquisar);
		   
		   txtNome = new JTextField();
		   txtNome.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtNome.setBounds(129, 76, 283, 20);
		   contentPane.add(txtNome);
		   txtNome.setColumns(10);
		   
		   txtEndereco = new JTextField();
		   txtEndereco.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtEndereco.setBounds(129, 101, 365, 20);
		   contentPane.add(txtEndereco);
		   txtEndereco.setColumns(10);
		   
		   txtMunicipio = new JTextField();
		   txtMunicipio.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtMunicipio.setBounds(129, 126, 143, 20);
		   contentPane.add(txtMunicipio);
		   txtMunicipio.setColumns(10);
		   
		   rdbtnM = new JRadioButton("M");
		   rdbtnM.setBounds(125, 275, 45, 23);
		   contentPane.add(rdbtnM);
		   
		   rdbtnF = new JRadioButton("F");
		   rdbtnF.setBounds(172, 275, 109, 23);
		   contentPane.add(rdbtnF);
		   
		   bt.add(rdbtnF);
		   bt.add(rdbtnM);
		   
		   MaskCampos mc = new MaskCampos();
		   
		   try {
		    txtCep = new JFormattedTextField(mc.masCep(txtCep));
		   } catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   txtCep.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtCep.setBounds(129, 151, 143, 20);
		   contentPane.add(txtCep);
		   
		   try {
		    txtTel = new JFormattedTextField(mc.maskTel(txtTel));
		   } catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   txtTel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtTel.setBounds(129, 176, 143, 20);
		   contentPane.add(txtTel);
		   
		   try {
		    txtCel = new JFormattedTextField(mc.maskCel(txtCel));
		   } catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   txtCel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtCel.setBounds(129, 201, 143, 20);
		   contentPane.add(txtCel);
		   
		   try {
		    txtCpf = new JFormattedTextField(mc.maskCpf(txtCpf));
		   } catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   txtCpf.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtCpf.setBounds(129, 226, 143, 20);
		   contentPane.add(txtCpf);
		   
		   try {
		    txtCnpj = new JFormattedTextField(mc.maskCnpj(txtCnpj));
		   } catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   txtCnpj.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   txtCnpj.setBounds(129, 251, 143, 20);
		   contentPane.add(txtCnpj);
		   
		    btnSalvar = new JButton("");
		   btnSalvar.setIcon(new ImageIcon(FormCliente.class.getResource("/img/save.png")));
		   btnSalvar.setBounds(193, 327, 28, 23);
		   btnSalvar.addActionListener(this);
		   btnSalvar.setActionCommand("salvar");
		   contentPane.add(btnSalvar);
		   
		    btnEditar = new JButton("");
		   btnEditar.setIcon(new ImageIcon(FormCliente.class.getResource("/img/edit.png")));
		   btnEditar.setBounds(231, 327, 28, 23);
		   btnEditar.addActionListener(this);
		   btnEditar.setActionCommand("editar");
		   contentPane.add(btnEditar);
		   
		    btnLimpar = new JButton("");
		   btnLimpar.setIcon(new ImageIcon(FormCliente.class.getResource("/img/clean.png")));
		   btnLimpar.setBounds(269, 327, 28, 23);
		   btnLimpar.addActionListener(this);
		   btnLimpar.setActionCommand("limpar");
		   contentPane.add(btnLimpar);
		   
		   btnExcluir = new JButton("");
		   btnExcluir.setIcon(new ImageIcon(FormCliente.class.getResource("/img/delete.png")));
		   btnExcluir.setBounds(308, 327, 28, 23);
		   btnExcluir.addActionListener(this);
		   btnExcluir.setActionCommand("excluir");
		   contentPane.add(btnExcluir);
		   
		   btnPesquisar = new JButton("");
		   btnPesquisar.setIcon(new ImageIcon(FormCliente.class.getResource("/img/search.png")));
		   btnPesquisar.setBounds(422, 22, 28, 23);
		   btnPesquisar.addActionListener(this);
		   btnPesquisar.setActionCommand("pesquisar");
		   contentPane.add(btnPesquisar);
		   
		   JLabel lblId = new JLabel("ID:");
		   lblId.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		   lblId.setBounds(10, 54, 46, 14);
		   contentPane.add(lblId);
		   
		   txtID = new JTextField();
	       txtID.setEditable(false);
		   txtID.setBounds(129, 51, 45, 20);
		   contentPane.add(txtID);
		   txtID.setColumns(10);
		  
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
