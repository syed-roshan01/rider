.class public final Ll5/s;
.super Ljava/lang/Object;

# interfaces
.implements Li5/e;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ll5/j;

.field public final c:Ll5/t;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ll5/j;Ll5/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5/s;->a:Ljava/util/Set;

    iput-object p2, p0, Ll5/s;->b:Ll5/j;

    iput-object p3, p0, Ll5/s;->c:Ll5/t;

    return-void
.end method


# virtual methods
.method public final a(Li5/c;Lb0/l0;)Landroidx/fragment/app/g;
    .locals 2

    iget-object v0, p0, Ll5/s;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Landroidx/fragment/app/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll5/s;->b:Ll5/j;

    iput-object v1, v0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    const-string v1, "FCM_CLIENT_EVENT_LOGGING"

    iput-object v1, v0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    iget-object p1, p0, Ll5/s;->c:Ll5/t;

    iput-object p1, v0, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, "%s is not supported byt this factory. Supported encodings are: %s."

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
