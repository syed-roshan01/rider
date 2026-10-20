.class public final Lm4/h;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/g;


# instance fields
.field public final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/h;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 5

    new-instance p1, Lm4/n;

    sget-object v0, Lja/x;->b:Ljava/lang/String;

    iget-object v0, p0, Lm4/h;->a:Ljava/io/File;

    invoke-static {v0}, Lfa/l;->j(Ljava/io/File;)Lja/x;

    move-result-object v1

    sget-object v2, Lja/m;->a:Lja/t;

    new-instance v3, Lk4/n;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v2, v4, v4}, Lk4/n;-><init>(Lja/x;Lja/m;Ljava/lang/String;Ljava/io/Closeable;)V

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getName(...)"

    invoke-static {v0, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x2e

    const-string v4, ""

    invoke-static {v0, v2, v4}, Ll9/i;->k1(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lk4/f;->c:Lk4/f;

    invoke-direct {p1, v3, v0, v1}, Lm4/n;-><init>(Lk4/o;Ljava/lang/String;Lk4/f;)V

    return-object p1
.end method
