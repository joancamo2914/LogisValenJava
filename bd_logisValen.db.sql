
CREATE TABLE IF NOT EXISTS "tb_art_alistadosPorLiderBod" (
	"id_alistado"	INTEGER NOT NULL UNIQUE,
	"id_ruta"	TEXT NOT NULL,
	"id_factura"	TEXT NOT NULL,
	"codigo_art"	TEXT,
	"fechaEntrega"	TEXT,
	"cantidad"	NUMERIC,
	PRIMARY KEY("id_alistado" AUTOINCREMENT),
	FOREIGN KEY("codigo_art") REFERENCES "tb_art_factura"("codigo"),
	FOREIGN KEY("id_factura") REFERENCES "tb_art_factura"("id_factura"),
	FOREIGN KEY("id_ruta") REFERENCES "tb_rutas"("id")
);
CREATE TABLE IF NOT EXISTS "tb_art_devueltos" (
	"id_devolucion"	INTEGER NOT NULL UNIQUE,
	"id_ruta"	TEXT,
	"id_factura"	TEXT,
	"codigo_art"	TEXT,
	"fechaEntrega"	TEXT,
	"cantidad"	NUMERIC,
	PRIMARY KEY("id_devolucion" AUTOINCREMENT),
	FOREIGN KEY("codigo_art") REFERENCES "tb_art_factura"("codigo"),
	FOREIGN KEY("id_factura") REFERENCES "tb_art_factura"("id_factura"),
	FOREIGN KEY("id_ruta") REFERENCES "tb_rutas"("id")
);
CREATE TABLE IF NOT EXISTS "tb_art_enRuta" (
	"id_enRuta"	INTEGER NOT NULL UNIQUE,
	"id_ruta"	TEXT NOT NULL,
	"id_factura"	TEXT NOT NULL,
	"codigo_art"	TEXT NOT NULL,
	"fechaEntrega"	TEXT,
	"cantidad"	NUMERIC,
	PRIMARY KEY("id_enRuta" AUTOINCREMENT),
	FOREIGN KEY("codigo_art") REFERENCES "tb_art_factura"("codigo"),
	FOREIGN KEY("id_factura") REFERENCES "tb_art_factura"("id_factura"),
	FOREIGN KEY("id_ruta") REFERENCES "tb_fact_ruta"("id_ruta")
);
CREATE TABLE IF NOT EXISTS "tb_art_entregadosAlCliente" (
	"id_entrega"	INTEGER NOT NULL UNIQUE,
	"id_ruta"	TEXT NOT NULL,
	"id_factura"	TEXT NOT NULL,
	"codigo_art"	TEXT NOT NULL,
	"fechaEntrega"	TEXT,
	"cantidad"	NUMERIC,
	"entregadoBool"	INTEGER,
	PRIMARY KEY("id_entrega" AUTOINCREMENT),
	FOREIGN KEY("codigo_art") REFERENCES "tb_art_factura"("codigo"),
	FOREIGN KEY("id_factura") REFERENCES "tb_art_factura"("id_factura"),
	FOREIGN KEY("id_ruta") REFERENCES "tb_rutas"("id")
);
CREATE TABLE IF NOT EXISTS "tb_art_factura" (
	"id_factura"	TEXT NOT NULL UNIQUE,
	"codigo"	TEXT NOT NULL,
	"cantidad"	NUMERIC,
	"unidad"	TEXT,
	"bodega"	TEXT,
	PRIMARY KEY("id_factura","codigo"),
	FOREIGN KEY("codigo") REFERENCES "tb_articulos"("codigo"),
	FOREIGN KEY("id_factura") REFERENCES "tb_facturas"("id")
);
CREATE TABLE IF NOT EXISTS "tb_art_reintegrados" (
	"id_reintegro"	INTEGER NOT NULL UNIQUE,
	"id_ruta"	TEXT NOT NULL,
	"id_factura"	TEXT NOT NULL,
	"codigo_art"	TEXT,
	"fechaReintegro"	TEXT,
	"cantidad"	NUMERIC,
	PRIMARY KEY("id_reintegro" AUTOINCREMENT),
	FOREIGN KEY("codigo_art") REFERENCES "tb_art_factura"("codigo"),
	FOREIGN KEY("id_factura") REFERENCES "tb_art_factura"("id_factura"),
	FOREIGN KEY("id_ruta") REFERENCES "tb_rutas"("id")
);
CREATE TABLE IF NOT EXISTS "tb_articulos" (
	"codigo"	TEXT NOT NULL UNIQUE,
	"descripcion"	TEXT,
	"unidad mayor"	TEXT,
	"unidad menor"	TEXT,
	"conversion"	TEXT,
	PRIMARY KEY("codigo")
);
CREATE TABLE IF NOT EXISTS "tb_bodegas" (
	"codigo"	TEXT NOT NULL UNIQUE,
	"username"	TEXT,
	PRIMARY KEY("codigo"),
	FOREIGN KEY("username") REFERENCES "tb_user"("username")
);
CREATE TABLE IF NOT EXISTS "tb_fact_ruta" (
	"id_ruta"	INTEGER NOT NULL UNIQUE,
	"id_factura"	TEXT,
	"fechaCreacion"	TEXT,
	"fechaTerminacion"	TEXT,
	"vehiculo"	TEXT,
	"conductor"	TEXT,
	PRIMARY KEY("id_ruta","id_factura"),
	FOREIGN KEY("id_factura") REFERENCES "tb_facturas"("id"),
	FOREIGN KEY("id_ruta") REFERENCES "tb_rutas"("id")
);
CREATE TABLE IF NOT EXISTS "tb_facturas" (
	"id"	TEXT NOT NULL UNIQUE,
	"fecha"	TEXT,
	"peso"	NUMERIC,
	"cliente"	TEXT,
	"estado"	TEXT,
	PRIMARY KEY("id")
);
CREATE TABLE IF NOT EXISTS "tb_rutas" (
	"id"	INTEGER NOT NULL UNIQUE,
	"fechaCreacion"	TEXT,
	"fechaTerminacion"	TEXT,
	"vehiculo"	TEXT,
	"conductor"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("conductor") REFERENCES "tb_user"("username"),
	FOREIGN KEY("vehiculo") REFERENCES "tb_vehiculos"("placa")
);
CREATE TABLE IF NOT EXISTS "tb_user" (
	"username"	TEXT NOT NULL UNIQUE,
	"password"	TEXT,
	"tipoUsuario"	TEXT,
	PRIMARY KEY("username")
);
CREATE TABLE IF NOT EXISTS "tb_vehiculos" (
	"placa"	TEXT NOT NULL UNIQUE,
	"tipo"	TEXT,
	"capacidad"	INTEGER,
	PRIMARY KEY("placa")
);
INSERT INTO "tb_user" VALUES ('Manuel','donroqui','conductor');
INSERT INTO "tb_user" VALUES ('Ramon','monchito','liderBodega');
INSERT INTO "tb_user" VALUES ('Yackson','carlota','liderLogistica');
COMMIT;
