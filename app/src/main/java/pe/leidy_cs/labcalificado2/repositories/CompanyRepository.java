package pe.leidy_cs.labcalificado2.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.leidy_cs.labcalificado2.models.Company;

public class CompanyRepository {

    private static List<Company> companies;

    static {
        companies = new ArrayList<>();
        companies.add(new Company(
                100,
                "Restaurantes"   ,
                "La casa del Tacu Tacu",
                "Av. Alameda Sur 699 Urb. Los Cedros de Villa, Chorrillos",
                "(01) 2547190",
                "informes@lacasadeltacutacu.com",
                "https://www.tripadvisor.com.pe/LocationPhotoDirectLink-g294316-d1096265-i71663216-La_casa_de_Don_Cucho-Lima_Lima_Region.html",
                "ic_company1",
                "Si quieren salir de Lima, un lugar muy recomendable. Comida criolla buena y abundante. Fin de semana pachamanca y chancho al palo. De un plato pueden comer 2 personas, Rango de los platos de fondo entre 40 y 50 soles.\n" +
                        "La decoraciòn es como una casona antigua..Recomiendo hacer reservaciòn o llegar temprano como a medio dìa para encontrar mesa y servicio ràpido. Abren desde ls 10:30am"));
        companies.add(new Company(
                101,
                "Restaurantes"   ,
                "Comidisima",
                "Jr. Pellotihue 53-48",
                "(01) 555-44458",
                "informes@comidisima.com",
                "https://elcomidista.elpais.com/elcomidista/2018/06/28/articulo/1530186086_872386.html",
                "ic_company2",
                "Granja Elena también sulivianta a Pau Arenós: \"Los gurmets buscan siempre el elefante blanco, aunque no para comerlo. Sería ese bar de alto voltaje culinario donde el lujo está en el plato. Sucede así en la Granja Elena, lejos de los circuitos –y cortocircuitos– gastro. Secreto de gastrónomos bocazas, Borja Sierra y familia se esmeran para que una judía sea un acontecimiento\"."));
        companies.add(new Company(
                102,
                "Bares"          ,
                "Sopranos",
                "Av. Aviación, Santiago de Surco 15038",
                "946 043 734",
                "reservas@sopranos.com.pe",
                "http://www.sopranos.com.pe",
                "ic_company3",
                "Disfruta Cantando\n" +
                        "¡Libera tu voz y saca el artista que Llevas dentro! Visítanos en cualquiera de nuestros locales ubicados en los principales distritos de Lima y Provincia."));
        companies.add(new Company(
                103,
                "Restaurantes"      ,
                "Don Belisario",
                "Av. Caminos del Inca 492, Santiago de Surco 15038",
                "(01) 6113333",
                "informes@donbelisario.com",
                "http://www.donbelisario.com.pe",
                "ic_company4",
                "Don Belisario es punto de reunión de sabores, de alegría y del bitute; todo para \n" +
                        "tu disfrute. Ingresa aquí y haz tu pedido"));
        companies.add(new Company(
                104,
                "Restaurantes"   ,
                "Ajo macho",
                "Jr. Pellotihue 53-48",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company5",
                "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(
                105, "Restaurantes"   ,
                "Raices del Peru",
                "Jr. Pellotihue 53-48",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company7",
                "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(
                106,
                "Pastelerias"    ,
                "Tortelin",
                "Metropolitana 733, Distrito de Lima 15011",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company6",
                "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(
                107,
                "Restaurantes"   ,
                "Taypa",
                "Jr. Pellotihue 53-48",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company8",
                "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(
                108,
                "Tiendas"        ,
                "Avinka",
                "Jr. Pellotihue 53-48",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company9",
                "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(
                109,
                "Tiendas"        ,
                "Sakimoto",
                " Nicolás Ayllón 4306, Ate 15012",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company10",
                "dejece cautiva por el mejor sabor criollo"));
        companies.add(new Company(
                110,
                "Tiendas"        ,
                "Efe",
                " Av. Nicolas Ayllon, Mz. L Lt. 25.",
                "(323) 555-44458",
                "informes@lacasadeltacutacu.com",
                "http://www.lacasadeltacutacu.com",
                "ic_company11",
                "dejece cautiva por el mejor sabor criollo"));
    }

    public static List<Company> getCompanies(){
        return companies;
    }
}
