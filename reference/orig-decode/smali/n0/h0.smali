.class public final Ln0/h0;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final synthetic d:Ln0/i0;


# direct methods
.method public constructor <init>(Ln0/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/h0;->d:Ln0/i0;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    iget-object v0, p0, Ln0/h0;->d:Ln0/i0;

    iget-object v0, v0, Ln0/i0;->c:[I

    iget v1, p0, Ln0/h0;->b:I

    add-int/2addr v1, p1

    aget p1, v0, v1

    return p1
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln0/h0;->d:Ln0/i0;

    iget-object v0, v0, Ln0/i0;->e:[Ljava/lang/Object;

    iget v1, p0, Ln0/h0;->c:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method
