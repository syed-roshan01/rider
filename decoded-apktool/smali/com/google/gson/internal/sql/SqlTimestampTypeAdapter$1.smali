.class Lcom/google/gson/internal/sql/SqlTimestampTypeAdapter$1;
.super Ljava/lang/Object;

# interfaces
.implements Lp7/b0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp7/n;Lu7/a;)Lp7/a0;
    .locals 1

    iget-object p2, p2, Lu7/a;->a:Ljava/lang/Class;

    const-class v0, Ljava/sql/Timestamp;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lu7/a;

    const-class v0, Ljava/util/Date;

    invoke-direct {p2, v0}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, p2}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object p1

    new-instance p2, Lcom/google/gson/internal/sql/c;

    invoke-direct {p2, p1}, Lcom/google/gson/internal/sql/c;-><init>(Lp7/a0;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
