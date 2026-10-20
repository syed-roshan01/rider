.class public final Lt1/w0;
.super Ljava/lang/Object;


# instance fields
.field public a:Ly0/n;

.field public b:I

.field public c:Lo0/i;

.field public d:Lo0/i;

.field public e:Z

.field public final synthetic f:Lt1/x0;


# direct methods
.method public constructor <init>(Lt1/x0;Ly0/n;ILo0/i;Lo0/i;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/w0;->f:Lt1/x0;

    iput-object p2, p0, Lt1/w0;->a:Ly0/n;

    iput p3, p0, Lt1/w0;->b:I

    iput-object p4, p0, Lt1/w0;->c:Lo0/i;

    iput-object p5, p0, Lt1/w0;->d:Lo0/i;

    iput-boolean p6, p0, Lt1/w0;->e:Z

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 2

    iget-object v0, p0, Lt1/w0;->c:Lo0/i;

    iget v1, p0, Lt1/w0;->b:I

    add-int/2addr p1, v1

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, Ly0/m;

    iget-object v0, p0, Lt1/w0;->d:Lo0/i;

    add-int/2addr v1, p2

    iget-object p2, v0, Lo0/i;->a:[Ljava/lang/Object;

    aget-object p2, p2, v1

    check-cast p2, Ly0/m;

    invoke-static {p1, p2}, Landroidx/compose/ui/node/b;->a(Ly0/m;Ly0/m;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
