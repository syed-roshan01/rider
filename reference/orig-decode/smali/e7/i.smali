.class public final Le7/i;
.super Le7/p;


# instance fields
.field public final b:Le7/m;

.field public final c:Lk7/a;


# direct methods
.method public constructor <init>(Le7/m;Lk7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/i;->b:Le7/m;

    iput-object p2, p0, Le7/i;->c:Lk7/a;

    return-void
.end method


# virtual methods
.method public final b()Lk7/a;
    .locals 1

    iget-object v0, p0, Le7/i;->c:Lk7/a;

    return-object v0
.end method

.method public final c()Lw6/c;
    .locals 1

    iget-object v0, p0, Le7/i;->b:Le7/m;

    return-object v0
.end method
