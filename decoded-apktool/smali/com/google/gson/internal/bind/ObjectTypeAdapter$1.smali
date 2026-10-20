.class Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;
.super Ljava/lang/Object;

# interfaces
.implements Lp7/b0;


# instance fields
.field public final synthetic a:Lp7/z;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lp7/y;->a:Lp7/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;->a:Lp7/z;

    return-void
.end method


# virtual methods
.method public final a(Lp7/n;Lu7/a;)Lp7/a0;
    .locals 1

    iget-object p2, p2, Lu7/a;->a:Ljava/lang/Class;

    const-class v0, Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    new-instance p2, Lcom/google/gson/internal/bind/g;

    iget-object v0, p0, Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;->a:Lp7/z;

    invoke-direct {p2, p1, v0}, Lcom/google/gson/internal/bind/g;-><init>(Lp7/n;Lp7/z;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
