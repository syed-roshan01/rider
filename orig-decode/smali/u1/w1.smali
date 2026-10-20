.class public final Lu1/w1;
.super Ljava/lang/Object;

# interfaces
.implements Lv0/l;


# instance fields
.field public final a:Lc9/a;

.field public final synthetic b:Lv0/l;


# direct methods
.method public constructor <init>(Lv0/n;Lf0/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu1/w1;->a:Lc9/a;

    iput-object p1, p0, Lu1/w1;->b:Lv0/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lu1/w1;->b:Lv0/l;

    invoke-interface {v0, p1}, Lv0/l;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lu1/w1;->b:Lv0/l;

    invoke-interface {v0}, Lv0/l;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu1/w1;->b:Lv0/l;

    invoke-interface {v0, p1}, Lv0/l;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;Lv0/c;)Lv0/m;
    .locals 1

    iget-object v0, p0, Lu1/w1;->b:Lv0/l;

    invoke-interface {v0, p1, p2}, Lv0/l;->e(Ljava/lang/String;Lv0/c;)Lv0/m;

    move-result-object p1

    return-object p1
.end method
